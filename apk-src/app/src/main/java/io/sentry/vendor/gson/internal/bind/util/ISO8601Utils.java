package io.sentry.vendor.gson.internal.bind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    public static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private static boolean checkOffset(String str, int i, char c8) {
        return i < str.length() && str.charAt(i) == c8;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb2, int i, int i10) {
        String string = Integer.toString(i);
        for (int length = i10 - string.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7 A[Catch: IllegalArgumentException -> 0x0052, NumberFormatException -> 0x0055, IndexOutOfBoundsException -> 0x0058, TryCatch #2 {IndexOutOfBoundsException -> 0x0058, NumberFormatException -> 0x0055, IllegalArgumentException -> 0x0052, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003e, B:13:0x0044, B:23:0x0061, B:25:0x0071, B:26:0x0073, B:28:0x007f, B:29:0x0082, B:31:0x0088, B:35:0x0092, B:40:0x00a2, B:42:0x00aa, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:84:0x017e, B:64:0x00fe, B:65:0x0114, B:66:0x0115, B:70:0x0125, B:72:0x0132, B:75:0x013b, B:77:0x014d, B:80:0x015c, B:81:0x0179, B:83:0x017c, B:69:0x0121, B:86:0x01b0, B:87:0x01b7, B:47:0x00c4, B:48:0x00c7), top: B:98:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b0 A[Catch: IllegalArgumentException -> 0x0052, NumberFormatException -> 0x0055, IndexOutOfBoundsException -> 0x0058, TryCatch #2 {IndexOutOfBoundsException -> 0x0058, NumberFormatException -> 0x0055, IllegalArgumentException -> 0x0052, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003e, B:13:0x0044, B:23:0x0061, B:25:0x0071, B:26:0x0073, B:28:0x007f, B:29:0x0082, B:31:0x0088, B:35:0x0092, B:40:0x00a2, B:42:0x00aa, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:84:0x017e, B:64:0x00fe, B:65:0x0114, B:66:0x0115, B:70:0x0125, B:72:0x0132, B:75:0x013b, B:77:0x014d, B:80:0x015c, B:81:0x0179, B:83:0x017c, B:69:0x0121, B:86:0x01b0, B:87:0x01b7, B:47:0x00c4, B:48:0x00c7), top: B:98:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date parse(java.lang.String r19, java.text.ParsePosition r20) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int parseInt(String str, int i, int i10) {
        int i11;
        int i12;
        if (i < 0 || i10 > str.length() || i > i10) {
            throw new NumberFormatException(str);
        }
        if (i < i10) {
            i12 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i10));
            }
            i11 = -iDigit;
        } else {
            i11 = 0;
            i12 = i;
        }
        while (i12 < i10) {
            int i13 = i12 + 1;
            int iDigit2 = Character.digit(str.charAt(i12), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i10));
            }
            i11 = (i11 * 10) - iDigit2;
            i12 = i13;
        }
        return -i11;
    }

    public static String format(Date date, boolean z5) {
        return format(date, z5, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z5, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(19 + (z5 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        padInt(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(13), 2);
        if (z5) {
            sb2.append('.');
            padInt(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int iAbs = Math.abs(i / 60);
            int iAbs2 = Math.abs(i % 60);
            sb2.append(offset >= 0 ? '+' : '-');
            padInt(sb2, iAbs, 2);
            sb2.append(':');
            padInt(sb2, iAbs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }
}
