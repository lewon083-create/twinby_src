package a3;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import z2.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t fragment, ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        this.f419c = container;
    }
}
