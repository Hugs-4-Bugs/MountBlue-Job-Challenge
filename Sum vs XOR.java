  public static long sumXor(long n) {
        // Get the count of all bits of 'n'
        long totalBits = (long) Math.ceil(Math.log(n + 1) / Math.log(2));
        // Get the count of all '1' of 'n'
        long oneBits = Long.bitCount(n);
        // Get the count of all '0' of 'n'
        long zeroBits = totalBits - oneBits;
        // The count of possible numbers that can be made with the zero bits
        return (long)Math.pow(2, zeroBits);
    }
