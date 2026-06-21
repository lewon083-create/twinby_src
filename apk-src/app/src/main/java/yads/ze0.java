package yads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ze0 extends s73 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final SparseArray N;
    public final SparseBooleanArray O;

    public ze0() {
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        a();
    }

    public final void a() {
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
    }

    @Override // yads.s73
    public final void b(Context context) {
        Point pointC = lb3.c(context);
        a(pointC.x, pointC.y);
    }

    public ze0(Context context) {
        super(context);
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        a();
    }

    @Override // yads.s73
    public final void a(Context context) {
        super.a(context);
    }

    @Override // yads.s73
    public final s73 a(int i, int i10) {
        this.i = i;
        this.f42840j = i10;
        this.f42841k = true;
        return this;
    }
}
