package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d63 extends ro implements Handler.Callback {
    public int A;
    public long B;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f37647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c63 f37648o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y43 f37649p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ox0 f37650q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f37651r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f37652s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f37653t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f37654u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public nx0 f37655v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v43 f37656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public z43 f37657x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a53 f37658y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a53 f37659z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d63(xn0 xn0Var, Looper looper) {
        super(3);
        x43 x43Var = y43.f44915a;
        this.f37648o = (c63) ni.a(xn0Var);
        this.f37647n = looper == null ? null : lb3.a(looper, (Handler.Callback) this);
        this.f37649p = x43Var;
        this.f37650q = new ox0();
        this.B = -9223372036854775807L;
    }

    @Override // yads.ro
    public final void a(long j10, boolean z5) {
        List list = Collections.EMPTY_LIST;
        Handler handler = this.f37647n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            ((xn0) this.f37648o).a(list);
            ((xn0) this.f37648o).a(new q20(list));
        }
        this.f37651r = false;
        this.f37652s = false;
        this.B = -9223372036854775807L;
        if (this.f37654u != 0) {
            p();
            n();
        } else {
            o();
            v43 v43Var = this.f37656w;
            v43Var.getClass();
            v43Var.flush();
        }
    }

    @Override // yads.ro
    public final String d() {
        return "TextRenderer";
    }

    @Override // yads.ro
    public final boolean f() {
        return this.f37652s;
    }

    @Override // yads.ro
    public final boolean g() {
        return true;
    }

    @Override // yads.ro
    public final void h() {
        this.f37655v = null;
        this.B = -9223372036854775807L;
        List list = Collections.EMPTY_LIST;
        Handler handler = this.f37647n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            ((xn0) this.f37648o).a(list);
            ((xn0) this.f37648o).a(new q20(list));
        }
        p();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        List list = (List) message.obj;
        ((xn0) this.f37648o).a(list);
        ((xn0) this.f37648o).a(new q20(list));
        return true;
    }

    public final long m() {
        if (this.A == -1) {
            return Long.MAX_VALUE;
        }
        this.f37658y.getClass();
        if (this.A >= this.f37658y.a()) {
            return Long.MAX_VALUE;
        }
        return this.f37658y.a(this.A);
    }

    public final void n() {
        this.f37653t = true;
        y43 y43Var = this.f37649p;
        nx0 nx0Var = this.f37655v;
        nx0Var.getClass();
        this.f37656w = ((x43) y43Var).a(nx0Var);
    }

    public final void o() {
        this.f37657x = null;
        this.A = -1;
        a53 a53Var = this.f37658y;
        if (a53Var != null) {
            a53Var.b();
            this.f37658y = null;
        }
        a53 a53Var2 = this.f37659z;
        if (a53Var2 != null) {
            a53Var2.b();
            this.f37659z = null;
        }
    }

    public final void p() {
        o();
        v43 v43Var = this.f37656w;
        v43Var.getClass();
        v43Var.release();
        this.f37656w = null;
        this.f37654u = 0;
    }

    @Override // yads.ro
    public final void a(nx0[] nx0VarArr, long j10, long j11) {
        this.f37655v = nx0VarArr[0];
        if (this.f37656w != null) {
            this.f37654u = 1;
        } else {
            n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    @Override // yads.ro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r12, long r14) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.d63.a(long, long):void");
    }

    @Override // yads.ro
    public final int a(nx0 nx0Var) {
        if (((x43) this.f37649p).b(nx0Var)) {
            return ro.a(nx0Var.F == 0 ? 4 : 2, 0, 0);
        }
        if (jt1.e(nx0Var.f41375m)) {
            return ro.a(1, 0, 0);
        }
        return ro.a(0, 0, 0);
    }
}
