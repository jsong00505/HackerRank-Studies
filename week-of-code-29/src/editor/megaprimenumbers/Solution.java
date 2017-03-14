package editor.megaprimenumbers;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by jsong on 14/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Megaprime Numbers
 */
public class Solution {
	static boolean hasPrimeDigitsOnly(long n) {
		while (n > 0) {
			int d = (int) (n % 10);
			if (d != 2 && d != 3 && d != 5 && d != 7) {
				return false;
			}
			n /= 10;
		}
		return true;
	}

	static Vector<Integer> getPrimesTill(int max) {
		assert(max >= 1);
		Vector<Integer> primes = new Vector<>();
		Boolean[] isPrime = new Boolean[1 + max];
		Arrays.fill(isPrime, true);

		isPrime[0] = false;
		isPrime[1] = false;
		for (int i = 2; i * i <= max; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= max; j += i) {
					isPrime[j] = false;
				}
			}
		}
		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i]) {
				primes.addElement(new Integer(i));
			}
		}
		return primes;
	}

	static int MAX_ROOT = (int)Math.sqrt(1e15);

	static int countMegaPrimes(long first, long last) {
		assert(1 <= first && last <= (long)MAX_ROOT * MAX_ROOT);
		if (first > last) {
			return 0;
		}
		Vector<Integer> primes = getPrimesTill(MAX_ROOT);
		Boolean[] isPrime = new Boolean[(int) (last - first + 1)];  // isPrime[i] <-> (i + first) is prime
		Arrays.fill(isPrime, true);

		for (int p : primes) {
			long p2 = p * p;
			if (p2 > last) {
				break;
			}
			long from = Math.max(p, (first + p - 1) / p) * p;
			assert(from >= first);
			int fromShifted = (int)(from - first);
			int lastShifted = (int)(last - first);
			for (int i = fromShifted; i <= lastShifted; i += p) {
				isPrime[i] = false;
			}
		}
		int count = 0;
		for (int i = 0; i < isPrime.length; i++) {
			if (isPrime[i] && hasPrimeDigitsOnly(i + first)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		long first, last;
		Scanner in = new Scanner(System.in);
		first = in.nextLong();
		last = in.nextLong();


		int CHUNK = 10 * 1000 * 1000;
		int CHUNK_FIRST = 2222222; // 7 digits
		int CHUNK_LAST = 7777777; // 7 digits
		int LAST_BEFORE_CHUNK = 777777; // 6 digits
		long count = 0;
		if (last <= LAST_BEFORE_CHUNK) {
			count = countMegaPrimes(first, last);
		} else {
			assert(last > LAST_BEFORE_CHUNK);
			if (first <= LAST_BEFORE_CHUNK) {
				count = countMegaPrimes(first, LAST_BEFORE_CHUNK);
				first = LAST_BEFORE_CHUNK + 1;
			}
			assert(first <= last);
			for (long partFirst = first / CHUNK * CHUNK + CHUNK_FIRST; partFirst <= last; partFirst += CHUNK) {
				if (hasPrimeDigitsOnly(partFirst)) {
					long partLast = partFirst - CHUNK_FIRST + CHUNK_LAST;
					count += countMegaPrimes(Math.max(first, partFirst), Math.min(last, partLast));
				}
			}
		}
		System.out.println(count);
	}
}
