package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.StringCharacterIterator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class StringUtils {
    private static final String CORRUPTED_NIL_UUID = "0000-0000";
    public static final String PROPER_NIL_UUID = "00000000-0000-0000-0000-000000000000";
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    @NotNull
    private static final Pattern PATTERN_WORD_SNAKE_CASE = Pattern.compile("[\\W_]+");

    private StringUtils() {
    }

    @NotNull
    public static String byteCountToString(long j10) {
        if (-1000 < j10 && j10 < 1000) {
            return j10 + " B";
        }
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("kMGTPE");
        while (true) {
            if (j10 > -999950 && j10 < 999950) {
                return String.format(Locale.ROOT, "%.1f %cB", Double.valueOf(j10 / 1000.0d), Character.valueOf(stringCharacterIterator.current()));
            }
            j10 /= 1000;
            stringCharacterIterator.next();
        }
    }

    @Nullable
    public static String calculateStringHash(@Nullable String str, @NotNull ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            try {
                return new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str.getBytes(UTF_8))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e3) {
                iLogger.log(SentryLevel.INFO, "SHA-1 isn't available to calculate the hash.", e3);
            } catch (Throwable th2) {
                iLogger.log(SentryLevel.INFO, "string: %s could not calculate its hash", th2, str);
            }
        }
        return null;
    }

    @Nullable
    public static String camelCase(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] strArrSplit = PATTERN_WORD_SNAKE_CASE.split(str, -1);
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            sb2.append(capitalize(str2));
        }
        return sb2.toString();
    }

    @Nullable
    public static String capitalize(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb2.append(strSubstring.toUpperCase(locale));
        sb2.append(str.substring(1).toLowerCase(locale));
        return sb2.toString();
    }

    public static int countOf(@NotNull String str, char c8) {
        int i = 0;
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (str.charAt(i10) == c8) {
                i++;
            }
        }
        return i;
    }

    @NotNull
    public static String getOrEmpty(@Nullable String str) {
        return str == null ? "" : str;
    }

    @Nullable
    public static String getStringAfterDot(@Nullable String str) {
        int i;
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(".");
        return (iLastIndexOf < 0 || str.length() <= (i = iLastIndexOf + 1)) ? str : str.substring(i);
    }

    public static String join(@NotNull CharSequence charSequence, @NotNull Iterable<? extends CharSequence> iterable) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<? extends CharSequence> it = iterable.iterator();
        if (it.hasNext()) {
            sb2.append(it.next());
            while (it.hasNext()) {
                sb2.append(charSequence);
                sb2.append(it.next());
            }
        }
        return sb2.toString();
    }

    public static String normalizeUUID(@NotNull String str) {
        return str.equals(CORRUPTED_NIL_UUID) ? PROPER_NIL_UUID : str;
    }

    @NotNull
    public static String removePrefix(@Nullable String str, @NotNull String str2) {
        return str == null ? "" : str.indexOf(str2) == 0 ? str.substring(str2.length()) : str;
    }

    @Nullable
    public static String removeSurrounding(@Nullable String str, @Nullable String str2) {
        return (str == null || str2 == null || !str.startsWith(str2) || !str.endsWith(str2)) ? str : str.substring(str2.length(), str.length() - str2.length());
    }

    @NotNull
    public static String substringBefore(@Nullable String str, @NotNull String str2) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(str2);
        return iIndexOf >= 0 ? str.substring(0, iIndexOf) : str;
    }

    @Nullable
    public static String toString(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }
}
