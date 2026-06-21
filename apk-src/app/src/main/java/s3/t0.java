package s3;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4.y f32649a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32653e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f32651c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32650b = new Object();

    public t0(i4.a aVar, boolean z5) {
        this.f32649a = new i4.y(aVar, z5);
    }

    @Override // s3.l0
    public final j3.o0 a() {
        return this.f32649a.f21074p;
    }

    @Override // s3.l0
    public final Object getUid() {
        return this.f32650b;
    }
}
