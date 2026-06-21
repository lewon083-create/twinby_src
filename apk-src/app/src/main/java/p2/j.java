package p2;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends oj.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.google.firebase.messaging.y f30986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f30987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.y f30988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f30989o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.google.firebase.messaging.y yVar, oj.c cVar) {
        super(cVar);
        this.f30988n = yVar;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f30987m = obj;
        this.f30989o |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f30988n.e(this);
    }
}
