package com.vk.api.sdk.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

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
public abstract class VKBaseAuthActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_WAITING_FOR_AUTH_RESULT = "VK_waitingForAuthResult";
    private boolean authWasStarted;
    private boolean isWaitingForAuthResult;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void processIntent(Intent intent, boolean z5) {
        Uri data = intent == null ? null : intent.getData();
        if (this.isWaitingForAuthResult || !isIntentWithAuthRequest(intent) || data == null) {
            if (z5) {
                setResult(-1, handleRedirectUri(data));
                finish();
                this.isWaitingForAuthResult = false;
                return;
            }
            return;
        }
        if (!handleStartAuth(data)) {
            finish();
        } else {
            this.isWaitingForAuthResult = true;
            this.authWasStarted = true;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public abstract Intent handleRedirectUri(Uri uri);

    public abstract boolean handleStartAuth(Uri uri);

    public abstract boolean isIntentWithAuthRequest(Intent intent);

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        this.isWaitingForAuthResult = bundle == null ? false : bundle.getBoolean(KEY_WAITING_FOR_AUTH_RESULT, false);
        processIntent(getIntent(), false);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        processIntent(intent, true);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.authWasStarted = false;
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.isWaitingForAuthResult || this.authWasStarted) {
            return;
        }
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(KEY_WAITING_FOR_AUTH_RESULT, this.isWaitingForAuthResult);
    }
}
