package ic;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Scope;
import g2.n0;
import java.lang.reflect.Field;
import java.util.Comparator;
import k6.n;
import k6.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l f21287c = new l(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l f21288d = new l(6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21289b;

    public /* synthetic */ l(int i) {
        this.f21289b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f21289b) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                return ((Scope) obj).f2628c.compareTo(((Scope) obj2).f2628c);
            case 2:
                return ((Scope) obj).f2628c.compareTo(((Scope) obj2).f2628c);
            case 3:
                return ((k1.e) obj).f26820c - ((k1.e) obj2).f26820c;
            case 4:
                return ((n) obj).f27136a - ((n) obj2).f27136a;
            case 5:
                x xVar = (x) obj;
                x xVar2 = (x) obj2;
                RecyclerView recyclerView = xVar.f27227d;
                if ((recyclerView == null) == (xVar2.f27227d == null)) {
                    boolean z5 = xVar.f27224a;
                    if (z5 == xVar2.f27224a) {
                        int i = xVar2.f27225b - xVar.f27225b;
                        if (i != 0) {
                            return i;
                        }
                        int i10 = xVar.f27226c - xVar2.f27226c;
                        if (i10 != 0) {
                            return i10;
                        }
                        return 0;
                    }
                    if (!z5) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 6:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 7:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 8:
                Field field = n0.f19900a;
                float z10 = ((View) obj).getZ();
                float z11 = ((View) obj2).getZ();
                if (z10 > z11) {
                    return -1;
                }
                return z10 < z11 ? 1 : 0;
            default:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
        }
    }
}
