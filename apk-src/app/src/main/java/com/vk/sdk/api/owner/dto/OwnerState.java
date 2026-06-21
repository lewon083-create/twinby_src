package com.vk.sdk.api.owner.dto;

import io.sentry.protocol.SentryThread;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class OwnerState {

    @b("description")
    @Nullable
    private final String description;

    @b(SentryThread.JsonKeys.STATE)
    @Nullable
    private final State state;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum State {
        BANNED(1),
        ADULT(2),
        HIDDEN(3),
        DELETED(4),
        BLACKLISTED(5);

        private final int value;

        State(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public OwnerState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OwnerState copy$default(OwnerState ownerState, State state, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            state = ownerState.state;
        }
        if ((i & 2) != 0) {
            str = ownerState.description;
        }
        return ownerState.copy(state, str);
    }

    @Nullable
    public final State component1() {
        return this.state;
    }

    @Nullable
    public final String component2() {
        return this.description;
    }

    @NotNull
    public final OwnerState copy(@Nullable State state, @Nullable String str) {
        return new OwnerState(state, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnerState)) {
            return false;
        }
        OwnerState ownerState = (OwnerState) obj;
        return this.state == ownerState.state && Intrinsics.a(this.description, ownerState.description);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final State getState() {
        return this.state;
    }

    public int hashCode() {
        State state = this.state;
        int iHashCode = (state == null ? 0 : state.hashCode()) * 31;
        String str = this.description;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OwnerState(state=" + this.state + ", description=" + this.description + ")";
    }

    public OwnerState(@Nullable State state, @Nullable String str) {
        this.state = state;
        this.description = str;
    }

    public /* synthetic */ OwnerState(State state, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : state, (i & 2) != 0 ? null : str);
    }
}
