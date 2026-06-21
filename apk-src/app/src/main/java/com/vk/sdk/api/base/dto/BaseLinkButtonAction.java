package com.vk.sdk.api.base.dto;

import a0.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class BaseLinkButtonAction {

    @b("consume_reason")
    @Nullable
    private final String consumeReason;

    @b("type")
    @NotNull
    private final BaseLinkButtonActionType type;

    @b("url")
    @Nullable
    private final String url;

    public BaseLinkButtonAction(@NotNull BaseLinkButtonActionType type, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.url = str;
        this.consumeReason = str2;
    }

    public static /* synthetic */ BaseLinkButtonAction copy$default(BaseLinkButtonAction baseLinkButtonAction, BaseLinkButtonActionType baseLinkButtonActionType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            baseLinkButtonActionType = baseLinkButtonAction.type;
        }
        if ((i & 2) != 0) {
            str = baseLinkButtonAction.url;
        }
        if ((i & 4) != 0) {
            str2 = baseLinkButtonAction.consumeReason;
        }
        return baseLinkButtonAction.copy(baseLinkButtonActionType, str, str2);
    }

    @NotNull
    public final BaseLinkButtonActionType component1() {
        return this.type;
    }

    @Nullable
    public final String component2() {
        return this.url;
    }

    @Nullable
    public final String component3() {
        return this.consumeReason;
    }

    @NotNull
    public final BaseLinkButtonAction copy(@NotNull BaseLinkButtonActionType type, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new BaseLinkButtonAction(type, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkButtonAction)) {
            return false;
        }
        BaseLinkButtonAction baseLinkButtonAction = (BaseLinkButtonAction) obj;
        return this.type == baseLinkButtonAction.type && Intrinsics.a(this.url, baseLinkButtonAction.url) && Intrinsics.a(this.consumeReason, baseLinkButtonAction.consumeReason);
    }

    @Nullable
    public final String getConsumeReason() {
        return this.consumeReason;
    }

    @NotNull
    public final BaseLinkButtonActionType getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.consumeReason;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BaseLinkButtonActionType baseLinkButtonActionType = this.type;
        String str = this.url;
        String str2 = this.consumeReason;
        StringBuilder sb2 = new StringBuilder("BaseLinkButtonAction(type=");
        sb2.append(baseLinkButtonActionType);
        sb2.append(", url=");
        sb2.append(str);
        sb2.append(", consumeReason=");
        return u.o(sb2, str2, ")");
    }

    public /* synthetic */ BaseLinkButtonAction(BaseLinkButtonActionType baseLinkButtonActionType, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseLinkButtonActionType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
