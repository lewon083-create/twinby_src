package yads;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zg2 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ah2 f45404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f45405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f45406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ug2 f45407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f45408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ah2 f45409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45410h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg2(ah2 ah2Var, mj.a aVar) {
        super(aVar);
        this.f45409g = ah2Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f45408f = obj;
        this.f45410h |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f45409g.a((Context) null, (List) null, this);
    }
}
