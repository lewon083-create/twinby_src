package com.vk.api.sdk;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public interface VKApiValidationHandler {

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static class Callback<T> {
        private final CountDownLatch latch;
        private volatile T value;

        public Callback(CountDownLatch latch) {
            Intrinsics.checkNotNullParameter(latch, "latch");
            this.latch = latch;
        }

        public void cancel() {
            this.latch.countDown();
        }

        public final CountDownLatch getLatch() {
            return this.latch;
        }

        public final T getValue() {
            return this.value;
        }

        public final void setValue(T t10) {
            this.value = t10;
        }

        public void submit(T t10) {
            this.value = t10;
            this.latch.countDown();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Credentials {
        public static final Companion Companion = new Companion(null);
        private static final Credentials EMPTY = new Credentials("", "", null);
        private final boolean isValid;
        private final String secret;
        private final String token;
        private final Integer uid;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Credentials getEMPTY() {
                return Credentials.EMPTY;
            }

            private Companion() {
            }
        }

        public Credentials(String str, String str2, Integer num) {
            this.secret = str;
            this.token = str2;
            this.uid = num;
            this.isValid = true ^ (str2 == null || StringsKt.D(str2));
        }

        public final String getSecret() {
            return this.secret;
        }

        public final String getToken() {
            return this.token;
        }

        public final Integer getUid() {
            return this.uid;
        }

        public final boolean isValid() {
            return this.isValid;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class DefaultImpls {
        public static void tryToHandleException(VKApiValidationHandler vKApiValidationHandler, VKApiExecutionException ex, VKApiManager apiManager) throws VKApiExecutionException {
            Intrinsics.checkNotNullParameter(vKApiValidationHandler, "this");
            Intrinsics.checkNotNullParameter(ex, "ex");
            Intrinsics.checkNotNullParameter(apiManager, "apiManager");
            throw ex;
        }
    }

    void handleCaptcha(String str, Callback<String> callback);

    void handleConfirm(String str, Callback<Boolean> callback);

    void handleValidation(String str, Callback<Credentials> callback);

    void tryToHandleException(VKApiExecutionException vKApiExecutionException, VKApiManager vKApiManager);
}
