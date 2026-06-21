package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f40850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f40851c;

    public m93(int i, String str, ArrayList arrayList, byte[] bArr) {
        this.f40849a = str;
        this.f40850b = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.f40851c = bArr;
    }
}
