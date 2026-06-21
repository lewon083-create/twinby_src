package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1rSDK;
import com.google.android.gms.internal.ads.om1;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.protocol.App;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFf1wSDK extends AFe1mSDK<Unit> {
    public AFg1nSDK areAllFieldsValid;
    public AFc1oSDK component1;
    public AFe1rSDK component2;
    public Executor component3;
    public AFc1hSDK component4;
    public Function1<AFe1uSDK, Unit> equals;
    public AFf1eSDK toString;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class AFa1uSDK implements OutcomeReceiver {
        private /* synthetic */ f0 AFAdRevenueData;
        private /* synthetic */ CountDownLatch getCurrencyIso4217Code;
        private /* synthetic */ AFf1wSDK getRevenue;

        public AFa1uSDK(f0 f0Var, CountDownLatch countDownLatch, AFf1wSDK aFf1wSDK) {
            this.AFAdRevenueData = f0Var;
            this.getCurrencyIso4217Code = countDownLatch;
            this.getRevenue = aFf1wSDK;
        }

        public final /* synthetic */ void onError(Throwable th2) {
            Exception exc = (Exception) th2;
            Intrinsics.checkNotNullParameter(exc, "");
            AFf1wSDK.getMediationNetwork(exc);
            this.getCurrencyIso4217Code.countDown();
        }

        public final void onResult(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.AFAdRevenueData.f27510b = AFe1uSDK.SUCCESS;
            AFLogger.INSTANCE.d(AFg1cSDK.PRIVACY_SANDBOX, "Privacy Sandbox trigger has been registered successfully. ", true);
            this.getCurrencyIso4217Code.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFf1wSDK(AFe1rSDK aFe1rSDK, Executor executor, AFc1oSDK aFc1oSDK, AFc1hSDK aFc1hSDK, AFg1nSDK aFg1nSDK, AFf1eSDK aFf1eSDK, Function1<? super AFe1uSDK, Unit> function1) {
        super(AFe1pSDK.REGISTER_TRIGGER, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, null);
        Intrinsics.checkNotNullParameter(aFe1rSDK, "");
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFg1nSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.component2 = aFe1rSDK;
        this.component3 = executor;
        this.component1 = aFc1oSDK;
        this.component4 = aFc1hSDK;
        this.areAllFieldsValid = aFg1nSDK;
        this.toString = aFf1eSDK;
        this.equals = function1;
        if (aFe1rSDK instanceof AFe1rSDK.AFa1tSDK) {
            this.AFAdRevenueData.add(AFe1pSDK.CONVERSION);
        }
        if (this.component2 instanceof AFe1rSDK.AFa1uSDK) {
            this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
        }
        if (this.component2 instanceof AFe1rSDK.AFa1zSDK) {
            this.getCurrencyIso4217Code.add(AFe1pSDK.INAPP);
        }
    }

    public static final /* synthetic */ void getMediationNetwork(Throwable th2) {
        AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, om1.k("Error occurred: ", th2.getMessage()), th2, false, false, false, true);
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return 20000L;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFe1uSDK aFe1uSDK = this.getMonetizationNetwork;
        if (aFe1uSDK != null) {
            this.equals.invoke(aFe1uSDK);
        }
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() {
        MeasurementManager measurementManagerJ;
        f0 f0Var = new f0();
        f0Var.f27510b = AFe1uSDK.FAILURE;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Context context = this.component4.getMonetizationNetwork;
            if (context != null && (measurementManagerJ = a6.j.j(context.getSystemService(a6.j.B()))) != null) {
                new AFj1cSDK(this.component1, null, 2, null);
                Uri.Builder builderBuildUpon = Uri.parse(AFj1cSDK.getMediationNetwork()).buildUpon();
                String strAreAllFieldsValid = this.component1.areAllFieldsValid();
                if (strAreAllFieldsValid == null) {
                    strAreAllFieldsValid = "";
                }
                LinkedHashMap linkedHashMapH = j0.h(new Pair("event_name", this.component2.getRevenue), new Pair(CommonUrlParts.APP_ID, this.component1.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName()), new Pair(App.JsonKeys.APP_VERSION, this.component1.n_().versionName), new Pair("sdk_version", AFc1oSDK.getMonetizationNetwork()), new Pair("api_version", AFc1oSDK.getCurrencyIso4217Code()), new Pair("timestamp", String.valueOf(this.areAllFieldsValid.getCurrencyIso4217Code())), new Pair(CommonUrlParts.REQUEST_ID, AFc1oSDK.getMediationNetwork()), new Pair("gaid", strAreAllFieldsValid));
                String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(this.component1.getMediationNetwork);
                if (currencyIso4217Code != null) {
                    linkedHashMapH.put("appsflyer_id", currencyIso4217Code);
                }
                Long monetizationNetwork = this.areAllFieldsValid.getMonetizationNetwork();
                if (monetizationNetwork != null) {
                    linkedHashMapH.put("install_time", String.valueOf(monetizationNetwork.longValue()));
                }
                AFe1rSDK aFe1rSDK = this.component2;
                if (aFe1rSDK instanceof AFe1rSDK.AFa1zSDK) {
                    Float f10 = ((AFe1rSDK.AFa1zSDK) aFe1rSDK).getCurrencyIso4217Code;
                    if (f10 != null) {
                        linkedHashMapH.put("event_revenue", String.valueOf(f10.floatValue()));
                    }
                    Integer num = ((AFe1rSDK.AFa1zSDK) this.component2).AFAdRevenueData;
                    if (num != null) {
                        linkedHashMapH.put("event_count", String.valueOf(num.intValue()));
                    }
                }
                for (Map.Entry entry : linkedHashMapH.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri uriBuild = builderBuildUpon.build();
                Intrinsics.checkNotNullExpressionValue(uriBuild, "");
                measurementManagerJ.registerTrigger(uriBuild, this.component3, new AFa1uSDK(f0Var, countDownLatch, this));
            }
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            f0Var.f27510b = AFe1uSDK.TIMEOUT;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, om1.k("Error occurred: ", th2.getMessage()), th2, false, false, false, true);
        }
        return (AFe1uSDK) f0Var.f27510b;
    }
}
