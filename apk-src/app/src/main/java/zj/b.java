package zj;

import dk.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements d {
    private Object value;

    public b(Object obj) {
        this.value = obj;
    }

    public abstract void afterChange(i iVar, Object obj, Object obj2);

    public boolean beforeChange(@NotNull i property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    @Override // zj.c
    public Object getValue(@Nullable Object obj, @NotNull i property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.value;
    }

    @Override // zj.d
    public void setValue(@Nullable Object obj, @NotNull i property, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj3 = this.value;
        if (beforeChange(property, obj3, obj2)) {
            this.value = obj2;
            afterChange(property, obj3, obj2);
        }
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
