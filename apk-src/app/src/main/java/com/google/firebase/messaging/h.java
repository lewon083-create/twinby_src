package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import java.util.List;
import yads.af0;
import yads.ff0;
import yads.if0;
import yads.k73;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements sb.a, ff0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14832d;

    public /* synthetic */ h(Object obj, Object obj2, boolean z5) {
        this.f14831c = obj;
        this.f14832d = obj2;
        this.f14830b = z5;
    }

    @Override // yads.ff0
    public List a(int i, k73 k73Var, int[] iArr) {
        return ((if0) this.f14831c).a((af0) this.f14832d, this.f14830b, i, k73Var, iArr);
    }

    @Override // sb.a
    public Object g(Task task) {
        return (ua.b.h() && ((Integer) task.getResult()).intValue() == 402) ? i.a((Context) this.f14831c, (Intent) this.f14832d, this.f14830b).e(new com.yandex.div.core.dagger.b(1), new bg.a(23)) : task;
    }
}
