package p2;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f31035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e0 f31036g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(e0 e0Var, int i) {
        super(0);
        this.f31035f = i;
        this.f31036g = e0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        switch (this.f31035f) {
            case 0:
                return ((l0) this.f31036g.f30959j.getValue()).f31017c;
            default:
                i0 i0Var = this.f31036g.f30951a;
                File file = ((File) i0Var.f30985b.invoke()).getCanonicalFile();
                synchronized (i0.f30983d) {
                    String path = file.getAbsolutePath();
                    LinkedHashSet linkedHashSet = i0.f30982c;
                    if (linkedHashSet.contains(path)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Intrinsics.checkNotNullExpressionValue(path, "path");
                    linkedHashSet.add(path);
                }
                Intrinsics.checkNotNullExpressionValue(file, "file");
                return new l0(file, i0Var.f30984a, (v0) h0.f30980f.invoke(file), new c7.i(2, file));
        }
    }
}
