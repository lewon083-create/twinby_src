package p2;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h0 f30980f = new h0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        File file = (File) obj;
        Intrinsics.checkNotNullParameter(file, "it");
        Intrinsics.checkNotNullParameter(file, "file");
        String filePath = file.getCanonicalFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(filePath, "file.canonicalFile.absolutePath");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new v0(filePath);
    }
}
