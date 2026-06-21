package com.monetization.ads.exo.source.dash;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.IOException;
import yads.f30;
import yads.ig1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ig1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f15035a;

    public f(i iVar) {
        this.f15035a = iVar;
    }

    @Override // yads.ig1
    public final void a() throws IOException {
        this.f15035a.A.a(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
        f30 f30Var = this.f15035a.C;
        if (f30Var != null) {
            throw f30Var;
        }
    }
}
