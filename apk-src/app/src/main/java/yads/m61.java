package yads;

import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m61 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n12 f40810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n61 f40811c;

    public m61(n61 n61Var, n12 n12Var) {
        this.f40811c = n61Var;
        this.f40810b = n12Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r61 r61Var;
        View viewA = this.f40810b.f41135c.a();
        if (viewA instanceof FrameLayout) {
            qc1 qc1Var = this.f40811c.f41181d;
            FrameLayout frameLayout = (FrameLayout) viewA;
            wb3 wb3VarA = ((m12) qc1Var.f42267a).a(qc1Var.f42268b, frameLayout.getContext(), false);
            o61 o61Var = this.f40811c.f41178a;
            o61Var.getClass();
            boolean z5 = wb3VarA instanceof tb3;
            p61 p61Var = o61Var.f41471a;
            WeakReference weakReference = (WeakReference) p61Var.f41827d.get(frameLayout);
            mq mqVar = weakReference != null ? (mq) weakReference.get() : null;
            if (mqVar == null) {
                mqVar = new mq(frameLayout.getContext(), p61Var.f41826c, new yl0());
                p61Var.f41827d.put(frameLayout, new WeakReference(mqVar));
                frameLayout.addView(mqVar);
            }
            p61Var.f41825b.getClass();
            mqVar.setColor(z5 ? -65536 : -16711936);
            if (z5) {
                WeakReference weakReference2 = (WeakReference) p61Var.f41828e.get(frameLayout);
                r61Var = weakReference2 != null ? (r61) weakReference2.get() : null;
                if (r61Var == null) {
                    r61Var = new r61(frameLayout.getContext(), new pg0());
                    p61Var.f41828e.put(frameLayout, new WeakReference(r61Var));
                    frameLayout.addView(r61Var);
                }
                p61Var.f41824a.getClass();
                r61Var.setDescription(wl3.a(wb3VarA));
            } else {
                WeakReference weakReference3 = (WeakReference) p61Var.f41828e.get(frameLayout);
                r61Var = weakReference3 != null ? (r61) weakReference3.get() : null;
                if (r61Var != null) {
                    p61Var.f41828e.remove(frameLayout);
                    frameLayout.removeView(r61Var);
                }
            }
            n61 n61Var = this.f40811c;
            n61Var.f41179b.postDelayed(new m61(n61Var, this.f40810b), 300L);
        }
    }
}
