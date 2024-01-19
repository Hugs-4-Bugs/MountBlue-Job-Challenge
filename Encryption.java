 public static String encryption(String s) {
        int l = s.length();
        double x = Math.sqrt(l);
        int columns = (int)Math.ceil(x);
        StringBuilder cadenas = new StringBuilder();

        for (int j = 0; j < columns; j++) {
            StringBuilder temp = new StringBuilder();
            for(int index = j; index < l; index+=columns) {
                temp.append(s.charAt(index));
            }
            cadenas.append(temp+" ");
        }

        System.out.println(cadenas);
        return cadenas.toString();
    }
