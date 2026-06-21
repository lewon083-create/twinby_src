package k6;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f27134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f27135g;

    public m1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f27135g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f27129a = -1;
        this.f27130b = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        this.f27131c = false;
        this.f27132d = false;
        this.f27133e = false;
        int[] iArr = this.f27134f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
