package io.appmetrica.analytics.internal;

import a0.u;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.Za;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class IdentifiersResult implements Parcelable {
    public static final Parcelable.Creator<IdentifiersResult> CREATOR = new Za();
    public final String errorExplanation;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f25138id;

    @NonNull
    public final IdentifierStatus status;

    public IdentifiersResult(String str, @NonNull IdentifierStatus identifierStatus, String str2) {
        this.f25138id = str;
        this.status = identifierStatus;
        this.errorExplanation = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            IdentifiersResult identifiersResult = (IdentifiersResult) obj;
            String str = this.f25138id;
            if (str == null ? identifiersResult.f25138id != null : !str.equals(identifiersResult.f25138id)) {
                return false;
            }
            if (this.status != identifiersResult.status) {
                return false;
            }
            String str2 = this.errorExplanation;
            if (str2 != null) {
                return str2.equals(identifiersResult.errorExplanation);
            }
            if (identifiersResult.errorExplanation == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f25138id;
        int iHashCode = (this.status.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.errorExplanation;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IdentifiersResult{id='");
        sb2.append(this.f25138id);
        sb2.append("', status=");
        sb2.append(this.status);
        sb2.append(", errorExplanation='");
        return u.o(sb2, this.errorExplanation, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25138id);
        parcel.writeString(this.status.getValue());
        parcel.writeString(this.errorExplanation);
    }
}
