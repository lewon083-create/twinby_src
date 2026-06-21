package yads;

import android.view.View;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends oj.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v0 f43500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f43501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.f0 f43502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f43503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f43504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v0 f43505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f43506h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, mj.a aVar) {
        super(aVar);
        this.f43505g = v0Var;
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) {
        this.f43504f = obj;
        this.f43506h |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
        return this.f43505g.a(null, null, this);
    }
}
