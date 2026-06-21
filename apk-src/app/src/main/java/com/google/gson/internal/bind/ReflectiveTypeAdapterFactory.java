package com.google.gson.internal.bind;

import com.google.android.gms.internal.ads.om1;
import com.google.gson.internal.Excluder;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import me.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l6.i f14923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final me.h f14924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Excluder f14925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f14926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qe.b f14927f = qe.b.f32105a;

    public ReflectiveTypeAdapterFactory(l6.i iVar, me.h hVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f14923b = iVar;
        this.f14924c = hVar;
        this.f14925d = excluder;
        this.f14926e = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r25v0 */
    @Override // me.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final me.w a(me.k r29, com.google.gson.reflect.a r30) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a(me.k, com.google.gson.reflect.a):me.w");
    }

    public final boolean b(Field field, boolean z5) {
        Class<?> type = field.getType();
        Excluder excluder = this.f14925d;
        if (excluder.b(type)) {
            return false;
        }
        excluder.c(z5);
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic()) {
            return false;
        }
        Class<?> type2 = field.getType();
        if (!Enum.class.isAssignableFrom(type2) && (type2.isAnonymousClass() || type2.isLocalClass())) {
            return false;
        }
        List list = z5 ? excluder.f14918b : excluder.f14919c;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw om1.i(it);
        }
        return true;
    }
}
