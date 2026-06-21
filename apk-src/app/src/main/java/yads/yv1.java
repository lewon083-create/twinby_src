package yads;

import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yv1 implements ma2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f45158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sv1 f45159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fw1 f45160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ql3 f45161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final eb3 f45162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dq0 f45163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pt2 f45164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lw1 f45165h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gq0 f45166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f45167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public jw1 f45168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public xu1 f45169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public wu1 f45170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public la2 f45171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public zh3 f45172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public jl3 f45173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public cq0 f45174r;

    public /* synthetic */ yv1(iw1 iw1Var) {
        this(iw1Var, new sv1(iw1Var), new fw1(), new ql3(), new eb3(), new dq0(), fw2.a().a(iw1Var.f()));
    }

    public final void a(dw1 dw1Var, LinkedHashMap linkedHashMap) throws vv1 {
        if (this.f45168l == null) {
            throw new vv1("Invalid state to execute this command");
        }
        switch (dw1Var.ordinal()) {
            case 0:
                zh3 zh3Var = this.f45172p;
                if (zh3Var != null) {
                    ((oh3) zh3Var).a();
                    return;
                }
                return;
            case 1:
                wu1 wu1Var = this.f45170n;
                if (wu1Var != null) {
                    wu1Var.e();
                    return;
                }
                return;
            case 2:
                wu1 wu1Var2 = this.f45170n;
                if (wu1Var2 != null) {
                    wu1Var2.b();
                    return;
                }
                return;
            case 3:
                if (jl3.f39901c == this.f45173q) {
                    jl3 jl3Var = jl3.f39903e;
                    this.f45173q = jl3Var;
                    this.f45159b.a(jl3Var);
                    la2 la2Var = this.f45171o;
                    if (la2Var != null) {
                        la2Var.c();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                a(linkedHashMap);
                return;
            case 5:
                xu1 xu1Var = this.f45169m;
                if (xu1Var != null) {
                    xu1Var.a();
                    return;
                }
                return;
            case 6:
                boolean z5 = Boolean.parseBoolean((String) linkedHashMap.get("shouldUseCustomClose"));
                la2 la2Var2 = this.f45171o;
                if (la2Var2 != null) {
                    la2Var2.a(z5);
                    return;
                }
                return;
            case 7:
            default:
                throw new vv1("Unspecified MRAID Javascript command");
            case 8:
                pt2 pt2Var = this.f45164g;
                if (pt2Var == null || !pt2Var.f42066z0) {
                    return;
                }
                this.f45158a.a();
                return;
        }
    }

    public final void b(String str) throws vv1 {
        this.f45162e.getClass();
        if (!eb3.a(str)) {
            this.f45159b.a(dw1.f37904d, "Mraid command sent an invalid URL");
            return;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if (!"mraid".equals(scheme) && !"mobileads".equals(scheme)) {
            a(kotlin.collections.i0.c(new Pair("url", str)));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : uri.getQueryParameterNames()) {
            linkedHashMap.put(str2, uri.getQueryParameter(str2));
        }
        dw1.f37903c.getClass();
        dw1 dw1VarA = cw1.a(host);
        try {
            a(dw1VarA, linkedHashMap);
        } catch (Exception e3) {
            String message = e3.getMessage();
            if (message == null) {
                message = "Unknown exception";
            }
            this.f45159b.a(dw1VarA, message);
        }
        this.f45159b.a(dw1VarA);
    }

    public final void c(zv1 zv1Var) {
        this.f45171o = zv1Var;
    }

    public yv1(iw1 iw1Var, sv1 sv1Var, fw1 fw1Var, ql3 ql3Var, eb3 eb3Var, dq0 dq0Var, pt2 pt2Var) {
        this.f45158a = iw1Var;
        this.f45159b = sv1Var;
        this.f45160c = fw1Var;
        this.f45161d = ql3Var;
        this.f45162e = eb3Var;
        this.f45163f = dq0Var;
        this.f45164g = pt2Var;
        lw1 lw1Var = new lw1(new xv1(this));
        this.f45165h = lw1Var;
        this.f45173q = jl3.f39902d;
        iw1Var.setWebViewClient(lw1Var);
        this.f45166j = new gq0(iw1Var, dq0Var, this);
        this.f45167k = tb.a(this);
    }

    public final void a(Map map) throws vv1 {
        p11 p11Var;
        if (this.f45168l != null) {
            pt2 pt2Var = this.f45164g;
            if (pt2Var == null || !pt2Var.B0 || this.i) {
                String str = (String) map.get("url");
                if (str != null && str.length() > 0) {
                    jw1 jw1Var = this.f45168l;
                    if (jw1Var == null || (p11Var = (p11) jw1Var.f39999a.get()) == null) {
                        return;
                    }
                    p11Var.a(str);
                    return;
                }
                String str2 = String.format("Mraid open command sent an invalid URL: %s", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                throw new vv1(str2);
            }
        }
    }

    public final void b(zv1 zv1Var) {
        this.f45169m = zv1Var;
    }

    public final void a(String str) {
        Context context = this.f45158a.getContext();
        fw1 fw1Var = this.f45160c;
        String str2 = this.f45167k;
        zl.s sVar = new zl.s(13, this, str);
        fw1Var.getClass();
        pt2 pt2VarA = fw2.a().a(context);
        String str3 = pt2VarA != null ? pt2VarA.P : null;
        if (str3 != null && str3.length() > 0) {
            k43 k43VarA = fw1.a(str3, str2, sVar);
            synchronized (yo2.a()) {
                u82.a(context).a(k43VarA);
            }
            return;
        }
        sVar.c(fw1.f38565a);
    }

    public static final void a(yv1 yv1Var, String str, String str2) {
        yv1Var.f45165h.f40707c = str2;
        jb2 jb2Var = yv1Var.f45159b.f43094a;
        jb2Var.loadDataWithBaseURL("https://yandex.ru", jb2Var.a(str), "text/html", "UTF-8", null);
    }

    public final void a() {
        p11 p11Var;
        this.i = true;
        jw1 jw1Var = this.f45168l;
        if (jw1Var == null || (p11Var = (p11) jw1Var.f39999a.get()) == null) {
            return;
        }
        p11Var.a();
    }

    public final void a(zv1 zv1Var) {
        this.f45170n = zv1Var;
    }

    public final void a(oh3 oh3Var) {
        this.f45172p = oh3Var;
    }
}
