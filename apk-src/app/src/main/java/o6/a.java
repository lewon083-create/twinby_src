package o6;

import android.os.Bundle;
import i0.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f29778a;

    public a(e registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f29778a = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // o6.d
    public final Bundle a() {
        j0.d();
        Bundle source = o.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        List value = CollectionsKt.R(this.f29778a);
        Intrinsics.checkNotNullParameter("classes_to_restore", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        List list = value;
        Intrinsics.checkNotNullParameter(list, "<this>");
        source.putStringArrayList("classes_to_restore", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        return source;
    }
}
