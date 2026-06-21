package h6;

import a6.j;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopicsManager f20448a;

    public h(TopicsManager mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.f20448a = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object d(h6.h r5, h6.b r6, mj.a r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof h6.g
            if (r0 == 0) goto L13
            r0 = r7
            h6.g r0 = (h6.g) r0
            int r1 = r0.f20447o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20447o = r1
            goto L18
        L13:
            h6.g r0 = new h6.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f20445m
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f20447o
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            h6.h r5 = r0.f20444l
            com.google.android.gms.internal.measurement.h5.E(r7)
            goto L66
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.google.android.gms.internal.measurement.h5.E(r7)
            android.adservices.topics.GetTopicsRequest r6 = r5.a(r6)
            r0.f20444l = r5
            r0.f20447o = r3
            hk.l r7 = new hk.l
            mj.a r2 = nj.f.b(r0)
            r7.<init>(r3, r2)
            r7.t()
            android.adservices.topics.TopicsManager r2 = r5.f20448a
            com.yandex.div.core.dagger.b r3 = new com.yandex.div.core.dagger.b
            r4 = 1
            r3.<init>(r4)
            c2.d r4 = new c2.d
            r4.<init>(r7)
            h6.e.n(r2, r6, r3, r4)
            java.lang.Object r7 = r7.s()
            if (r7 != r1) goto L63
            java.lang.String r6 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
        L63:
            if (r7 != r1) goto L66
            return r1
        L66:
            android.adservices.topics.GetTopicsResponse r6 = h6.e.b(r7)
            h6.c r5 = r5.b(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.h.d(h6.h, h6.b, mj.a):java.lang.Object");
    }

    public GetTopicsRequest a(b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(request, "request");
        GetTopicsRequest.Builder builderK = j.k();
        request.getClass();
        GetTopicsRequest getTopicsRequestBuild = builderK.setAdsSdkName("com.google.android.gms.ads").build();
        Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public c b(GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicO = j.o(it.next());
            arrayList.add(new d(topicO.getTopicId(), topicO.getTaxonomyVersion(), topicO.getModelVersion()));
        }
        return new c(arrayList);
    }

    public Object c(b bVar, mj.a aVar) {
        return d(this, bVar, aVar);
    }
}
