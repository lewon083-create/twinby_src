package com.google.android.gms.internal.auth;

import android.util.Base64;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f13208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f13209b;

    static {
        q qVar = new q(o.a(), true, true);
        Double dValueOf = Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE);
        new p(qVar, "getTokenRefactor__account_data_service_sample_percentage", dValueOf, 2);
        qVar.d("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        qVar.c(20L, "getTokenRefactor__account_manager_timeout_seconds");
        qVar.c(0L, "getTokenRefactor__android_id_shift");
        try {
            f13208a = new p(qVar, "getTokenRefactor__blocked_packages", z1.j(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), 3);
            qVar.d("getTokenRefactor__chimera_get_token_evolved", true);
            qVar.c(20L, "getTokenRefactor__clear_token_timeout_seconds");
            qVar.c(20L, "getTokenRefactor__default_task_timeout_seconds");
            qVar.d("getTokenRefactor__gaul_accounts_api_evolved", false);
            f13209b = qVar.d("getTokenRefactor__gaul_token_api_evolved", false);
            qVar.c(120L, "getTokenRefactor__get_token_timeout_seconds");
            qVar.d("getTokenRefactor__gms_account_authenticator_evolved", true);
            new p(qVar, "getTokenRefactor__gms_account_authenticator_sample_percentage", dValueOf, 2);
        } catch (Exception e3) {
            throw new AssertionError(e3);
        }
    }
}
