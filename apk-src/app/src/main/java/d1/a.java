package d1;

import android.util.Size;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15505c;

    public /* synthetic */ a(int i, int i10) {
        this.f15504b = i10;
        this.f15505c = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f15504b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                int i = this.f15505c;
                int iAbs = Math.abs(iIntValue - i) - Math.abs(((Integer) obj2).intValue() - i);
                return (int) (iAbs == 0 ? Math.signum(r4.intValue() - r5.intValue()) : Math.signum(iAbs));
            default:
                int iA = p0.b.a((Size) obj);
                int i10 = this.f15505c;
                return Math.abs(iA - i10) - Math.abs(p0.b.a((Size) obj2) - i10);
        }
    }
}
