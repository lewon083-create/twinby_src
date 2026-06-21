package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y21 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yi0 f12469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f12470d;

    public /* synthetic */ y21(yi0 yi0Var, Runnable runnable, int i) {
        this.f12468b = i;
        this.f12469c = yi0Var;
        this.f12470d = runnable;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f12468b) {
            case 0:
                yi0 yi0Var = this.f12469c;
                Runnable runnable = this.f12470d;
                if (((n21) yi0Var.f12630k) != null || yi0Var.f12622b) {
                    if (!yi0Var.f12622b) {
                        runnable.run();
                        return;
                    }
                    ((fa1) yi0Var.f12625e).a("Waiting to bind to the service.", new Object[0]);
                    ArrayList arrayList = (ArrayList) yi0Var.f12627g;
                    synchronized (arrayList) {
                        arrayList.add(runnable);
                        break;
                    }
                    return;
                }
                ((fa1) yi0Var.f12625e).a("Initiate binding to the service.", new Object[0]);
                ArrayList arrayList2 = (ArrayList) yi0Var.f12627g;
                synchronized (arrayList2) {
                    arrayList2.add(runnable);
                    break;
                }
                w21 w21Var = new w21(yi0Var);
                yi0Var.f12629j = w21Var;
                yi0Var.f12622b = true;
                if (((Context) yi0Var.f12623c).bindService((Intent) yi0Var.f12628h, w21Var, 1)) {
                    return;
                }
                ((fa1) yi0Var.f12625e).a("Failed to bind to the service.", new Object[0]);
                yi0Var.f12622b = false;
                ArrayList arrayList3 = (ArrayList) yi0Var.f12627g;
                synchronized (arrayList3) {
                    arrayList3.clear();
                    break;
                }
                return;
            default:
                yi0 yi0Var2 = this.f12469c;
                try {
                    this.f12470d.run();
                    return;
                } catch (RuntimeException e3) {
                    ((fa1) yi0Var2.f12625e).c("error caused by ", e3);
                    return;
                }
        }
    }
}
