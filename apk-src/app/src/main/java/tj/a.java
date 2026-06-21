package tj;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends androidx.datastore.preferences.protobuf.m {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(File file, File file2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        file2 = (i & 2) != 0 ? null : file2;
        str = (i & 4) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(file, "file");
        super(file, file2, str);
    }
}
