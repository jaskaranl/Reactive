package com.spr.videochatreactive.beans;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.spr.videochatreactive.chime.ChimeVideoChatConversationProviderDetails;

import static com.spr.videochatreactive.VideoChatConstants.AMAZON_CHIME;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        visible = true,
        property = "provider"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ChimeVideoChatConversationProviderDetails.class, name = AMAZON_CHIME)
})
public abstract class VideoChatConversationProviderDetails {

    protected String provider;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
