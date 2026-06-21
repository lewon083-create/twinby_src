package l4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.ads.rm;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends rm {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f27861w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f27862x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f27863y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f27864z;

    public i(j jVar) {
        a(jVar);
        this.f27861w = jVar.f27865w;
        this.f27862x = jVar.f27866x;
        this.f27863y = jVar.f27867y;
        this.f27864z = jVar.f27868z;
        this.A = jVar.A;
        this.B = jVar.B;
        this.C = jVar.C;
        SparseArray sparseArray = jVar.D;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.D = sparseArray2;
        this.E = jVar.E.clone();
    }

    public i() {
        super(1);
        this.D = new SparseArray();
        this.E = new SparseBooleanArray();
        this.f27861w = true;
        this.f27862x = true;
        this.f27863y = true;
        this.f27864z = true;
        this.A = true;
        this.B = true;
        this.C = true;
    }
}
