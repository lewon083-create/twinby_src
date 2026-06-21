package dc;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.material.chip.Chip;
import ic.h;
import ic.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15739h;
    public final /* synthetic */ Object i;

    public /* synthetic */ b(int i, Object obj) {
        this.f15739h = i;
        this.i = obj;
    }

    @Override // com.google.android.gms.internal.measurement.d4
    public final void s(int i) {
        switch (this.f15739h) {
            case 0:
                break;
            default:
                i iVar = (i) this.i;
                iVar.f21281d = true;
                h hVar = (h) iVar.f21282e.get();
                if (hVar != null) {
                    f fVar = (f) hVar;
                    fVar.u();
                    fVar.invalidateSelf();
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.d4
    public final void t(Typeface typeface, boolean z5) {
        switch (this.f15739h) {
            case 0:
                Chip chip = (Chip) this.i;
                f fVar = chip.f14541f;
                chip.setText(fVar.D0 ? fVar.F : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z5) {
                    i iVar = (i) this.i;
                    iVar.f21281d = true;
                    h hVar = (h) iVar.f21282e.get();
                    if (hVar != null) {
                        f fVar2 = (f) hVar;
                        fVar2.u();
                        fVar2.invalidateSelf();
                    }
                    break;
                }
                break;
        }
    }

    private final void O(int i) {
    }
}
