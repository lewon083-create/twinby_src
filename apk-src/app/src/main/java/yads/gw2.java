package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gw2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f38918j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile gw2 f38919k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile pt2 f38920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f38921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f38922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38925f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f38926g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f38927h;
    public boolean i;

    public final boolean a() {
        boolean z5;
        synchronized (f38918j) {
            z5 = this.i;
        }
        return z5;
    }

    public final Boolean b() {
        Boolean bool;
        synchronized (f38918j) {
            bool = this.f38922c;
        }
        return bool;
    }

    public final boolean c() {
        boolean z5;
        synchronized (f38918j) {
            z5 = this.f38924e;
        }
        return z5;
    }

    public final Boolean d() {
        Boolean bool;
        synchronized (f38918j) {
            bool = this.f38921b;
        }
        return bool;
    }

    public final pt2 a(Context context) {
        pt2 pt2VarA;
        pt2 pt2Var = this.f38920a;
        if (pt2Var != null) {
            return pt2Var;
        }
        synchronized (f38918j) {
            pt2VarA = this.f38920a;
            if (pt2VarA == null) {
                zy.f45589a.getClass();
                pt2VarA = ((cz) yy.a(context)).a();
                this.f38920a = pt2VarA;
            }
        }
        return pt2VarA;
    }

    public final void a(Context context, pt2 pt2Var) {
        synchronized (f38918j) {
            this.f38920a = pt2Var;
            zy.f45589a.getClass();
            ((cz) yy.a(context)).a(pt2Var);
            Unit unit = Unit.f27471a;
        }
    }
}
