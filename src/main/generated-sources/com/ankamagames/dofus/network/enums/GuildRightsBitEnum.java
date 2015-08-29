
// Created by Heat the 2015-03-01 20:22:01+01:00
package com.ankamagames.dofus.network.enums;

import java.util.Optional;

public enum GuildRightsBitEnum {
    
        GUILD_RIGHT_NONE(0),
    
        GUILD_RIGHT_BOSS(1),
    
        GUILD_RIGHT_MANAGE_GUILD_BOOSTS(2),
    
        GUILD_RIGHT_MANAGE_RIGHTS(4),
    
        GUILD_RIGHT_INVITE_NEW_MEMBERS(8),
    
        GUILD_RIGHT_BAN_MEMBERS(16),
    
        GUILD_RIGHT_MANAGE_XP_CONTRIBUTION(32),
    
        GUILD_RIGHT_MANAGE_RANKS(64),
    
        GUILD_RIGHT_HIRE_TAX_COLLECTOR(128),
    
        GUILD_RIGHT_MANAGE_MY_XP_CONTRIBUTION(256),
    
        GUILD_RIGHT_COLLECT(512),
    
        GUILD_RIGHT_USE_PADDOCKS(4096),
    
        GUILD_RIGHT_ORGANIZE_PADDOCKS(8192),
    
        GUILD_RIGHT_TAKE_OTHERS_MOUNTS_IN_PADDOCKS(16384),
    
        GUILD_RIGHT_DEFENSE_PRIORITY(32768),
    
        GUILD_RIGHT_COLLECT_MY_TAX_COLLECTOR(65536),
    
        GUILD_RIGHT_SET_ALLIANCE_PRISM(131072),
    
        GUILD_RIGHT_TALK_IN_ALLIANCE_CHAN(262144),
    
    ;

    public final int value;

    private GuildRightsBitEnum(int value) {
        this.value = value;
    }

    public static Optional<GuildRightsBitEnum> valueOf(int value) {
        for (GuildRightsBitEnum it : values()) {
            if (it.value == value) {
                return Optional.of(it);
            }
        }
        return Optional.empty();
    }
}
