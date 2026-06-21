package e4;

import ad.b1;
import android.net.Uri;
import com.google.android.gms.internal.measurement.h5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.Session;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f16063c;

    public d0(int i, long j10, Uri uri) {
        this.f16061a = j10;
        this.f16062b = i;
        this.f16063c = uri;
    }

    public static b1 a(Uri uri, String str) {
        ad.q.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String str2 = m3.z.f28608a;
        int i = -1;
        String[] strArrSplit = str.split(StringUtils.COMMA, -1);
        int length = strArrSplit.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str3 = strArrSplit[i10];
            String[] strArrSplit2 = str3.split(";", i);
            int length2 = strArrSplit2.length;
            int i12 = i;
            int i13 = i10;
            long j10 = -9223372036854775807L;
            int i14 = 0;
            Uri uriB = null;
            while (i14 < length2) {
                String str4 = strArrSplit2[i14];
                try {
                    String[] strArrSplit3 = str4.split("=", 2);
                    String str5 = strArrSplit3[0];
                    String str6 = strArrSplit3[1];
                    int iHashCode = str5.hashCode();
                    String[] strArr = strArrSplit;
                    if (iHashCode != 113759) {
                        if (iHashCode != 116079) {
                            if (iHashCode != 1524180539 || !str5.equals("rtptime")) {
                                throw j3.d0.b(str5, null);
                            }
                            j10 = Long.parseLong(str6);
                            i14++;
                            strArrSplit = strArr;
                        } else {
                            if (!str5.equals("url")) {
                                throw j3.d0.b(str5, null);
                            }
                            uriB = b(uri, str6);
                            i14++;
                            strArrSplit = strArr;
                        }
                    } else {
                        if (!str5.equals(Session.JsonKeys.SEQ)) {
                            throw j3.d0.b(str5, null);
                        }
                        i12 = Integer.parseInt(str6);
                        i14++;
                        strArrSplit = strArr;
                    }
                } catch (Exception e3) {
                    throw j3.d0.b(str4, e3);
                }
            }
            String[] strArr2 = strArrSplit;
            if (uriB != null && uriB.getScheme() != null) {
                i = -1;
                if (i12 != -1 || j10 != -9223372036854775807L) {
                    d0 d0Var = new d0(i12, j10, uriB);
                    int i15 = i11 + 1;
                    int iF = ad.e0.f(objArrCopyOf.length, i15);
                    if (iF > objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                    }
                    objArrCopyOf[i11] = d0Var;
                    i11 = i15;
                    strArrSplit = strArr2;
                    i10 = i13 + 1;
                }
            }
            throw j3.d0.b(str3, null);
        }
        return ad.j0.p(i11, objArrCopyOf);
    }

    public static Uri b(Uri uri, String str) {
        String scheme = uri.getScheme();
        scheme.getClass();
        h5.h(scheme.equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        Uri uri3 = Uri.parse("rtsp://" + str);
        String string = uri.toString();
        String host = uri3.getHost();
        host.getClass();
        return host.equals(uri.getHost()) ? uri3 : string.endsWith("/") ? m3.b.q(string, str) : m3.b.q(string.concat("/"), str);
    }
}
