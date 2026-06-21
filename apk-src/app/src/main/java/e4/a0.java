package e4;

import ad.b1;
import ad.k0;
import ad.q1;
import android.net.Uri;
import com.google.android.gms.internal.ads.jx0;
import com.google.android.gms.internal.measurement.h5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f16036a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f16037b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f16038c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f16039d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f16040e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f16041f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f16042g = new String(new byte[]{10});

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f16043h = new String(new byte[]{13, 10});

    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                return 0;
        }
    }

    public static b1 b(String str) {
        if (str == null) {
            ad.h0 h0Var = ad.j0.f818c;
            return b1.f768f;
        }
        ad.q.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String str2 = m3.z.f28608a;
        int i = 0;
        for (String str3 : str.split(",\\s?", -1)) {
            int iA = a(str3);
            if (iA != 0) {
                Integer numValueOf = Integer.valueOf(iA);
                int i10 = i + 1;
                int iF = ad.e0.f(objArrCopyOf.length, i10);
                if (iF > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                }
                objArrCopyOf[i] = numValueOf;
                i = i10;
            }
        }
        return ad.j0.p(i, objArrCopyOf);
    }

    public static jx0 c(String str) {
        long j10;
        Matcher matcher = f16039d.matcher(str);
        if (!matcher.matches()) {
            throw j3.d0.b(str, null);
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j10 = ((long) Integer.parseInt(strGroup2)) * 1000;
            } catch (NumberFormatException e3) {
                throw j3.d0.b(str, e3);
            }
        } else {
            j10 = 60000;
        }
        return new jx0(strGroup, j10);
    }

    public static d8.a d(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            return null;
        }
        String str = m3.z.f28608a;
        String[] strArrSplit = userInfo.split(StringUtils.PROCESS_POSTFIX_DELIMITER, 2);
        return new d8.a(strArrSplit[0], strArrSplit[1], 2);
    }

    public static la.m e(String str) {
        Matcher matcher = f16040e.matcher(str);
        String str2 = "";
        int i = 1;
        if (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(3);
            strGroup2.getClass();
            String strGroup3 = matcher.group(4);
            return new la.m(2, strGroup, strGroup2, strGroup3 == null ? "" : strGroup3, 3);
        }
        Matcher matcher2 = f16041f.matcher(str);
        if (matcher2.matches()) {
            String strGroup4 = matcher2.group(1);
            strGroup4.getClass();
            return new la.m(i, strGroup4, str2, str2, 3);
        }
        throw j3.d0.b("Invalid WWW-Authenticate header " + str, null);
    }

    public static b1 f(b0 b0Var) {
        h5.h(b0Var.f16055c.b("CSeq") != null);
        ad.g0 g0Var = new ad.g0(4);
        Object[] objArr = {g(b0Var.f16054b), b0Var.f16053a, "RTSP/1.0"};
        String str = m3.z.f28608a;
        g0Var.b(String.format(Locale.US, "%s %s %s", objArr));
        k0 k0Var = b0Var.f16055c.f16165a;
        q1 it = k0Var.f821e.keySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            ad.j0 j0VarG = k0Var.g(str2);
            for (int i = 0; i < j0VarG.size(); i++) {
                g0Var.b(String.format(Locale.US, "%s: %s", str2, j0VarG.get(i)));
            }
        }
        g0Var.b("");
        g0Var.b(b0Var.f16056d);
        return g0Var.g();
    }

    public static String g(int i) {
        switch (i) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
