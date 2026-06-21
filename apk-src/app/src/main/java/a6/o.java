package a6;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import com.google.android.gms.internal.measurement.h5;
import d.r;
import kk.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f477a;

    public o(l lVar) {
        this.f477a = lVar;
    }

    public final void onBackCancelled() {
        l input = this.f477a;
        c cVar = input.f454a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!input.f455b) {
            cVar.c(input, null);
        }
        Intrinsics.checkNotNullParameter(input, "input");
        g gVar = cVar.f449b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.equals(gVar.f463h) && -1 == gVar.f462g) {
            r rVarC = gVar.f461f;
            if (rVarC == null) {
                rVarC = gVar.c(-1);
            }
            gVar.f461f = null;
            gVar.f462g = 0;
            gVar.f463h = null;
            if (rVarC != null) {
                rVarC.f15474f.handleOnBackCancelled();
            }
            t tVar = gVar.f456a;
            tVar.getClass();
            tVar.H(null, h.f469b);
        }
        input.f455b = false;
    }

    public final void onBackInvoked() {
        this.f477a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        b event = h5.a(backEvent);
        Intrinsics.checkNotNullParameter(event, "event");
        l input = this.f477a;
        c cVar = input.f454a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (input.f455b) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(event, "event");
            g gVar = cVar.f449b;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(event, "event");
            if (input.equals(gVar.f463h) && -1 == gVar.f462g) {
                r rVarC = gVar.f461f;
                if (rVarC == null) {
                    rVarC = gVar.c(-1);
                }
                if (rVarC != null) {
                    Intrinsics.checkNotNullParameter(event, "event");
                    Intrinsics.checkNotNullParameter(event, "latestEvent");
                    Intrinsics.checkNotNullParameter(event, "event");
                    rVarC.f15474f.handleOnBackProgressed(new d.a(event));
                }
                t tVar = gVar.f456a;
                i iVar = new i(event);
                tVar.getClass();
                tVar.H(null, iVar);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        b event = h5.a(backEvent);
        Intrinsics.checkNotNullParameter(event, "event");
        l lVar = this.f477a;
        c cVar = lVar.f454a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (lVar.f455b) {
            return;
        }
        cVar.c(lVar, event);
        lVar.f455b = true;
    }
}
