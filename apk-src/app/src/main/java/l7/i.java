package l7;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.a8;
import com.google.android.gms.internal.ads.b8;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.e9;
import com.google.android.gms.internal.measurement.f7;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.i7;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.u7;
import com.google.firebase.messaging.y;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import m3.z;
import ob.d0;
import ob.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements m4.k, n5.k, ob.f, w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i f28029c = new i(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i f28030d = new i(12);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i f28031e = new i(13);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ i f28032f = new i(14);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ i f28033g = new i(15);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i f28034h = new i(16);
    public static final /* synthetic */ i i = new i(17);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ i f28035j = new i(18);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ i f28036k = new i(19);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ i f28037l = new i(20);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ i f28038m = new i(21);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ i f28039n = new i(22);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ i f28040o = new i(23);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ i f28041p = new i(24);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ i f28042q = new i(25);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ i f28043r = new i(26);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ i f28044s = new i(27);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ i f28045t = new i(28);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ i f28046u = new i(29);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28047b;

    public /* synthetic */ i(int i10) {
        this.f28047b = i10;
    }

    public static nl.j e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (ol.b.a(str.charAt(i11 + 1)) + (ol.b.a(str.charAt(i11)) << 4));
        }
        return new nl.j(bArr);
    }

    public static nl.j f(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        nl.j jVar = new nl.j(bytes);
        jVar.f29544d = str;
        return jVar;
    }

    @Override // n5.k
    public int a(j3.o oVar) {
        String str = oVar.f26335n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(om1.k("Unsupported MIME type: ", str));
    }

    @Override // n5.k
    public n5.m b(j3.o oVar) {
        int i10;
        String str = oVar.f26335n;
        List list = oVar.f26338q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new p5.f(list);
                case "application/pgs":
                    return new s7.g(13);
                case "application/x-mp4-vtt":
                    return new m7.a(25);
                case "text/vtt":
                    return new r3.b(27);
                case "application/x-quicktime-tx3g":
                    return new a8(list, 1);
                case "text/x-ssa":
                    return new r5.a(list);
                case "application/vobsub":
                    y yVar = new y();
                    yVar.f14899b = new m3.p();
                    yVar.f14900c = new m3.p();
                    b8 b8Var = new b8(1);
                    yVar.f14901d = b8Var;
                    String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
                    String str2 = z.f28608a;
                    for (String str3 : strTrim.split("\\r?\\n", -1)) {
                        if (str3.startsWith("palette: ")) {
                            String[] strArrSplit = str3.substring(9).split(StringUtils.COMMA, -1);
                            b8Var.f3666d = new int[strArrSplit.length];
                            for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                                int[] iArr = b8Var.f3666d;
                                try {
                                    i10 = Integer.parseInt(strArrSplit[i11].trim(), 16);
                                } catch (RuntimeException e3) {
                                    m3.b.t("VobsubParser", "Parsing color failed", e3);
                                    i10 = 0;
                                }
                                iArr[i11] = i10;
                            }
                        } else if (str3.startsWith("size: ")) {
                            String[] strArrSplit2 = str3.substring(6).trim().split("x", -1);
                            if (strArrSplit2.length != 2) {
                                m3.b.s("VobsubParser", "Ignoring malformed IDX size line: '" + str3 + "'");
                            } else {
                                try {
                                    b8Var.f3667e = Integer.parseInt(strArrSplit2[0]);
                                    b8Var.f3668f = Integer.parseInt(strArrSplit2[1]);
                                    b8Var.f3664b = true;
                                } catch (RuntimeException e7) {
                                    m3.b.t("VobsubParser", "Parsing IDX failed", e7);
                                }
                            }
                        }
                    }
                    return yVar;
                case "application/x-subrip":
                    return new s5.a();
                case "application/ttml+xml":
                    return new t5.d();
            }
        }
        throw new IllegalArgumentException(om1.k("Unsupported MIME type: ", str));
    }

    @Override // n5.k
    public boolean c(j3.o oVar) {
        String str = oVar.f26335n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // ob.w
    public Object h() {
        switch (this.f28047b) {
            case 12:
                return new Boolean(((Boolean) u7.f14006a.b()).booleanValue());
            case 13:
                List list = d0.f29996a;
                g7.f13765c.get();
                Long l10 = (Long) i7.f13788b.b();
                l10.getClass();
                return l10;
            case 14:
                List list2 = d0.f29996a;
                Boolean bool = (Boolean) e9.f13721a.b();
                bool.getClass();
                return bool;
            case 15:
                List list3 = d0.f29996a;
                Boolean bool2 = (Boolean) f7.f13747a.b();
                bool2.getClass();
                return bool2;
            case 16:
                List list4 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.f13805k0.b()).longValue());
            case 17:
                List list5 = d0.f29996a;
                g7.f13765c.get();
                return (String) i7.f13824u0.b();
            case 18:
                List list6 = d0.f29996a;
                g7.f13765c.get();
                return (String) i7.N.b();
            case 19:
                List list7 = d0.f29996a;
                g7.f13765c.get();
                Long l11 = (Long) i7.U.b();
                l11.getClass();
                return l11;
            case 20:
                List list8 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.K.b()).longValue());
            case 21:
                List list9 = d0.f29996a;
                g7.f13765c.get();
                Long l12 = (Long) i7.S.b();
                l12.getClass();
                return l12;
            case 22:
                List list10 = d0.f29996a;
                g7.f13765c.get();
                Long l13 = (Long) i7.I.b();
                l13.getClass();
                return l13;
            case 23:
                List list11 = d0.f29996a;
                g7.f13765c.get();
                Long l14 = (Long) i7.f13826v0.b();
                l14.getClass();
                return l14;
            case 24:
                List list12 = d0.f29996a;
                g7.f13765c.get();
                Long l15 = (Long) i7.i.b();
                l15.getClass();
                return l15;
            case 25:
                List list13 = d0.f29996a;
                g7.f13765c.get();
                Long l16 = (Long) i7.V.b();
                l16.getClass();
                return l16;
            case 26:
                List list14 = d0.f29996a;
                g7.f13765c.get();
                return (String) i7.f13800h.b();
            case 27:
                List list15 = d0.f29996a;
                g7.f13765c.get();
                Long l17 = (Long) i7.f13814p0.b();
                l17.getClass();
                return l17;
            case 28:
                List list16 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.f13821t.b()).longValue());
            default:
                List list17 = d0.f29996a;
                q8.f13932c.get();
                Boolean bool3 = (Boolean) s8.f13961a.b();
                bool3.getClass();
                return bool3;
        }
    }

    @Override // ob.f
    public /* synthetic */ String i(String str, String str2) {
        return null;
    }

    @Override // m4.k
    public void load() {
        synchronized (n4.b.f29097a) {
            Object obj = n4.b.f29098b;
            synchronized (obj) {
                if (n4.b.f29099c) {
                    return;
                }
                long jA = n4.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    n4.b.f29100d = jA;
                    n4.b.f29099c = true;
                }
            }
        }
    }

    public i(Context context) {
        this.f28047b = 1;
    }

    @Override // m4.k
    public void d() {
    }
}
