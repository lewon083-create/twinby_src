package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m70 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f7802c;

    public /* synthetic */ m70(n70 n70Var, int i) {
        this.f7801b = i;
        switch (i) {
            case 1:
                this.f7802c = new WeakReference(n70Var);
                break;
            default:
                this.f7802c = new WeakReference(n70Var);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7801b) {
            case 0:
                n70 n70Var = (n70) this.f7802c.get();
                if (n70Var != null) {
                    n70Var.A1(v60.f11272w);
                }
                break;
            default:
                n70 n70Var2 = (n70) this.f7802c.get();
                if (n70Var2 != null) {
                    n70Var2.A1(v60.f11271v);
                }
                break;
        }
    }
}
