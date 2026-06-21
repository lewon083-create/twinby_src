package tj;

import java.io.File;
import java.util.Iterator;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f33933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f33934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f33935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f33936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function2 f33937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33938f;

    public i(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i10 & 2) != 0 ? FileWalkDirection.f27500b : fileWalkDirection;
        i = (i10 & 32) != 0 ? Integer.MAX_VALUE : i;
        this.f33933a = file;
        this.f33934b = fileWalkDirection;
        this.f33935c = function1;
        this.f33936d = function12;
        this.f33937e = function2;
        this.f33938f = i;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new g(this);
    }
}
