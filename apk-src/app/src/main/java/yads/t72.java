package yads;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t72 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u72 f43198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f43199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ty1 f43200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f43201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v5 f43202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f43203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f43204h;
    public final /* synthetic */ u72 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43205j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t72(u72 u72Var, mj.a aVar) {
        super(aVar);
        this.i = u72Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f43204h = obj;
        this.f43205j |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.i.a(null, null, this);
    }
}
