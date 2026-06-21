package fj;

import android.content.Context;
import android.hardware.display.DisplayManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1.m f19403a;

    public q(a1.m pigeonRegistrar, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f19403a = pigeonRegistrar;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f19403a = pigeonRegistrar;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f19403a = pigeonRegistrar;
                break;
            default:
                Intrinsics.checkNotNullParameter(pigeonRegistrar, "pigeonRegistrar");
                this.f19403a = pigeonRegistrar;
                break;
        }
    }

    public d1 a() {
        DisplayManager displayManager = (DisplayManager) ((Context) this.f19403a.f365e).getSystemService("display");
        ArrayList arrayListG = ya.e.G(displayManager);
        d1 d1Var = new d1(this);
        ArrayList arrayListG2 = ya.e.G(displayManager);
        arrayListG2.removeAll(arrayListG);
        if (!arrayListG2.isEmpty()) {
            Iterator it = arrayListG2.iterator();
            while (it.hasNext()) {
                displayManager.unregisterDisplayListener((DisplayManager.DisplayListener) it.next());
                displayManager.registerDisplayListener(new n(arrayListG2, displayManager, 0), null);
            }
        }
        return d1Var;
    }
}
