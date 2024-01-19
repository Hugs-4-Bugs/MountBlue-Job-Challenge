public static long taumBday(int b, int w, int bc, int wc, int z) {
    // Write your code here
    
    long blackGifts = (long) Math.min(bc, wc+z) * b;
    long whiteGifts = (long) Math.min(wc, bc+z) * w;    
    return blackGifts + whiteGifts;

    }
