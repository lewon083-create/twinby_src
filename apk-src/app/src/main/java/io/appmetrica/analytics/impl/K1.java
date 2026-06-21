package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class K1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0432qa f22545a = new C0432qa();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f22546b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f22547c = new LinkedHashMap();

    public final void a() {
    }

    public final void b() {
    }

    public final void c(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f22545a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f22546b.entrySet()) {
                J1 j12 = (J1) entry.getKey();
                if (((I1) entry.getValue()).a(intent)) {
                    j12.a(intent);
                }
            }
        }
    }

    public final void d(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                C0432qa c0432qa = this.f22545a;
                Integer numValueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) c0432qa.f24625a.get(action);
                if (collection != null && collection.remove(numValueOf)) {
                    if (collection.isEmpty() && c0432qa.f24626b) {
                        c0432qa.f24625a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f22547c.entrySet()) {
                J1 j12 = (J1) entry.getKey();
                if (((I1) entry.getValue()).a(intent)) {
                    j12.a(intent);
                }
            }
        }
    }

    public final void a(@NotNull Intent intent, int i) {
    }

    public final void b(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f22545a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f22546b.entrySet()) {
                J1 j12 = (J1) entry.getKey();
                if (((I1) entry.getValue()).a(intent)) {
                    j12.a(intent);
                }
            }
        }
    }

    public final void a(@NotNull Intent intent, int i, int i10) {
    }

    public final void a(@NotNull Configuration configuration) {
    }

    public final void a(@NotNull J1 j12) {
        this.f22547c.put(j12, new bp(this, 0));
    }

    public static final boolean a(K1 k12, Intent intent) {
        k12.getClass();
        if (!"io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction())) {
            return false;
        }
        Collection collection = (Collection) k12.f22545a.f24625a.get("io.appmetrica.analytics.IAppMetricaService");
        return collection == null || collection.size() == 0;
    }

    public final void c(@NotNull J1 j12) {
        this.f22546b.put(j12, new bp(this, 2));
    }

    public static final boolean c(K1 k12, Intent intent) {
        k12.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction());
    }

    public final void b(@NotNull J1 j12) {
        this.f22546b.put(j12, new bp(this, 1));
    }

    public static final boolean b(K1 k12, Intent intent) {
        Collection collection;
        k12.getClass();
        return "io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction()) && (collection = (Collection) k12.f22545a.f24625a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data == null || !Intrinsics.a(data.getPath(), "/client")) {
            return -1;
        }
        try {
            String queryParameter = data.getQueryParameter("pid");
            Intrinsics.b(queryParameter);
            return Integer.parseInt(queryParameter);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
