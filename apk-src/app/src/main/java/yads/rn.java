package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rn extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zn f42633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ua3 f42634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f42635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zn f42636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42637f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(zn znVar, mj.a aVar) {
        super(aVar);
        this.f42636e = znVar;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f42635d = obj;
        this.f42637f |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return zn.a(this.f42636e, null, this);
    }
}
