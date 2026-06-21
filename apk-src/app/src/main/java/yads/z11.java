package yads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InputStream f45225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f45226e;

    public z11(int i, ArrayList arrayList, int i10, d21 d21Var) {
        this.f45222a = i;
        this.f45223b = arrayList;
        this.f45224c = i10;
        this.f45225d = d21Var;
        this.f45226e = null;
    }

    public z11(int i, List list, byte[] bArr) {
        this.f45222a = i;
        this.f45223b = list;
        this.f45224c = bArr.length;
        this.f45226e = bArr;
        this.f45225d = null;
    }
}
