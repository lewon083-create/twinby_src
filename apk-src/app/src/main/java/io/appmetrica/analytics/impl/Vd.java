package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Vd f23132a = new Vd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f23133b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f23134c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.14.2", "50157683");

    public final synchronized ExponentialBackoffDataHolder a(Td td2) {
        Object exponentialBackoffDataHolder;
        try {
            LinkedHashMap linkedHashMap = f23133b;
            exponentialBackoffDataHolder = linkedHashMap.get(td2);
            if (exponentialBackoffDataHolder == null) {
                exponentialBackoffDataHolder = new ExponentialBackoffDataHolder(new C0606xa(C0382oa.I.y(), td2), td2.name());
                linkedHashMap.put(td2, exponentialBackoffDataHolder);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (ExponentialBackoffDataHolder) exponentialBackoffDataHolder;
    }

    public static final NetworkTask a(Y4 y42) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        Yg yg = new Yg(aESRSARequestBodyEncrypter);
        C0657zb c0657zb = new C0657zb(y42);
        return new NetworkTask(new BlockingExecutor(), new C0427q5(y42.f23282a), new AllHostsExponentialBackoffPolicy(f23132a.a(Td.REPORT)), new C0513th(y42, yg, c0657zb, new FullUrlFormer(yg, c0657zb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), y42.i(), y42.p(), y42.u(), aESRSARequestBodyEncrypter), kotlin.collections.r.c(new jo()), f23134c);
    }
}
