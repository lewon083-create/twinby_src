package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j2 implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17457a;

    public j2(sy syVar) {
        this.f17457a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        l2 l2Var = (l2) entityTemplate;
        return new l2(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "content", parsingContext.getAllowPropertyOverride(), l2Var != null ? l2Var.f17666a : null, this.f17457a.f18365d0));
    }
}
